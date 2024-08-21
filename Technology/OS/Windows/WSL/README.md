## [Windows Subsystem for Linux](https://docs.microsoft.com/en-us/windows/wsl/)

Lets you run a GNU/Linux environment on Windows without virtual machine (e.g. VirtualBox) or dual-boot setup.

## Setup

* on Windows, find the "Turn Windows features on and off" utility.
* find "Windows Subsystem for Linux" in the list and check the checkbox (enable it)
* you might have to restart Windows at this point
* installing WSL will probably involve going to the Microsoft store and installing an "app" called Ubuntu (this is actually the choice of the Linux distibution - there could be many other options that also utilize WSL. This README assumes that Ubuntu will be the desired distro for most readers)

Ubuntu: /mnt/c/

### To update from WSL1 to WSL2

Run CMD, then `wsl -l -v`. It should return the name of the distro you installed, as well as the version of WSL it's running on.

To update it to WSL2, simply run `wsl --set-version <distro name> 2`

### To open a VS Code instance inside the WSL filesystem

* make sure that the WSL extension is installed in VS Code (on Windows)
* in the WSL terminal, navigate to your desired development folder, and run `code .`. This should open a VS Code window opened to that folder.
