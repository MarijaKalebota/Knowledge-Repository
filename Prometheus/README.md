## [Prometheus](https://prometheus.io/)

Prometheus is a monitoring and alerting toolkit.  
Prometheus scrapes targets for metrics, stores them in a time series database and allows graphing tools to consume them.  

### [First steps](https://prometheus.io/docs/introduction/first_steps/)

Collects metrics from HTTP endpoints on targets.  

Install by executing:
```
$: tar xvfz prometheus-*.tar.gz
$: cd prometheus-*
```

Configure it using YAML, "prometheus.yml":
```
global: # -> 
  scrape_interval:     15s # -> scraping frequency
  evaluation_interval: 15s # -> rule eval frequency
#   external_labels:
#     monitor: 'codelab-monitor'

rule_files: # -> rule locations
#  - 'prometheus.rules.yml'

scrape_configs: # -> monitoring configs
  - job_name: prometheus
#     scrape_interval: 5s -> override global scraping frequency
    static_configs:
      - targets: ['localhost:9090'] # -> scrapes from "http://localhost:9090/metrics"
#         labels: # -> groups targets 
#           group: 'production'
```

Run Prometheus by executing:  
```
./prometheus --config.file=prometheus.yml
```

View Prometheus HTTP endpoint which exposes metrics by visiting:  
```
http://localhost:9090/metrics
```

View metrics using the Prometheus' expression browser:  
```
http://localhost:9090/graph

Filter query:  promhttp_metric_handler_requests_total{code="200"}
Count query:   count(promhttp_metric_handler_requests_total)
Rate query:    rate(promhttp_metric_handler_requests_total{code="200"}[1m])
```

You should explore other metric exporters.  

### [Getting Started](https://prometheus.io/docs/prometheus/latest/getting_started/)

Start Prometheus by executing:  
```
./prometheus --config.file=prometheus.yml
```

Instead of ad hoc querying you can create a rule file "prometheus.rules.yml":
```
groups:
- name: example
  rules:
  - record: job_service:rpc_durations_seconds_count:avg_rate5m
    expr: avg(rate(rpc_durations_seconds_count[5m])) by (job, service)
```
Don't forget to add the rule to "prometheus.yml".  

### [Configuration](https://prometheus.io/docs/prometheus/latest/configuration/configuration/)

TODO  

### [Query expressions](https://prometheus.io/docs/prometheus/latest/querying/basics/)

TODO  

### [Guides](https://prometheus.io/docs/guides/)

TODO  