## 启动pg
```
docker run --rm --name saga-postgres -p 5432:5432 -e POSTGRES_DB=saga -e POSTGRES_USER=saga -e POSTGRES_PASSWORD=password postgres:9.5
```

## 初始化
schema-postgresql.sql

## 启动alpha-server
```
java -jar -Dspring.profiles.active=prd \
 alpha-server-0.2.0-exec.jar \
 --spring.datasource.url=jdbc:postgresql://192.168.99.100:5432/saga \
 --spring.datasource.username=saga \
 --spring.datasource.password=password \
 --alpha.server.port=9090 \
 --server.port=9091
```

