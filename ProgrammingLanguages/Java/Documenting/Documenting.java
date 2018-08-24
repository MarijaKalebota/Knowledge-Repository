/**
 * This javadoc describes a class.
 * 
 * author _name    : Name (and contact information such as email) of the author(s).
 * version _version: Current version of the program.
 * since _version  : When this part of the program was first added.
 * 
 * @author I am the Author!
 * @version 1.0.0
 * @since 0.9.0
 */
public class Documenting {

    /**
     * This javadoc describes a method.
     * 
     * param _name _desc    : For describing the different parameters for a method.
     * return _desc         : For describing what the method returns.
     * exception _name _desc: For describing exceptions.
     * 
     * @param a Any integer.
     * @param b Any integer except zero.
     * @return A float, a result of the division.
     * @exception ArithmeticException If b is zero.
     */
    public float Division(int a, int b) {
        return a / b;
    }
    /*
    Other javadoc keywords.
    @see _data_type_name Links to another part of the documentation.
    @deprecated _version For showing the code is outdated or shouldn't be used.
    */
}
