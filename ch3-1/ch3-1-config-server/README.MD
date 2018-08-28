## API Resources
|  Path                               |  Description                                                        |
| ----------------------------------- | ------------------------------------------------------------------- |
|  /{app}/{profile}                   |  Configuration data for app in Spring profile (comma-separated).    |
|  /{app}/{profile}/{label}           |  Add a git label                                                    |
|  /{app}/{profiels}{label}/{path}    |  An environment-specific plain text config file (at "path")         |

## 实例
```
curl -i localhost:8888/eureka-client1/default
curl -i localhost:8888/eureka-server1/default
```