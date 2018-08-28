INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('demo', 'default', 'master', 'app.greet.name', 'Demo');

-- eureka server
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'server.port', '${SERVER_PORT:8761}');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'eureka.instance.preferIpAddress', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'eureka.instance.lease-renewal-interval-in-seconds', '10');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'eureka.instance.lease-expiration-duration-in-seconds', '30');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'eureka.client.registerWithEureka', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'eureka.client.fetchRegistry', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'eureka.client.serviceUrl.defaultZone', 'http://${EUREKA_SERVER_HOST}:${EUREKA_SERVER_PORT}/eureka/');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'eureka.server.waitTimeInMsWhenSyncEmpty', '0');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'eureka.server.enableSelfPreservation', 'false');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('eureka-server', 'default', 'master', 'eureka.server.eviction-interval-timer-in-ms', '10000');

-- gateway
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('gateway', 'default', 'master', 'server.port', '${SERVER_PORT:8000}');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('gateway', 'default', 'master', 'eureka.instance.preferIpAddress', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('gateway', 'default', 'master', 'eureka.instance.lease-renewal-interval-in-seconds', '10');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('gateway', 'default', 'master', 'eureka.instance.lease-expiration-duration-in-seconds', '30');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('gateway', 'default', 'master', 'eureka.client.registerWithEureka', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('gateway', 'default', 'master', 'eureka.client.fetchRegistry', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('gateway', 'default', 'master', 'eureka.client.serviceUrl.defaultZone', 'http://${EUREKA_SERVER1_HOST}:${EUREKA_SERVER1_PORT}/eureka/,http://${EUREKA_SERVER2_HOST}:${EUREKA_SERVER2_PORT}/eureka/');

-- turbine
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('turbine', 'default', 'master', 'turbine.appConfig', 'gateway,biz-service');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('turbine', 'default', 'master', 'server.port', '${SERVER_PORT:8001}');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('turbine', 'default', 'master', 'eureka.instance.preferIpAddress', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('turbine', 'default', 'master', 'eureka.instance.lease-renewal-interval-in-seconds', '10');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('turbine', 'default', 'master', 'eureka.instance.lease-expiration-duration-in-seconds', '30');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('turbine', 'default', 'master', 'eureka.client.registerWithEureka', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('turbine', 'default', 'master', 'eureka.client.fetchRegistry', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('turbine', 'default', 'master', 'eureka.client.serviceUrl.defaultZone', 'http://${EUREKA_SERVER1_HOST}:${EUREKA_SERVER1_PORT}/eureka/,http://${EUREKA_SERVER2_HOST}:${EUREKA_SERVER2_PORT}/eureka/');

-- spring-admin
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('spring-admin', 'default', 'master', 'server.port', '${SERVER_PORT:8002}');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('spring-admin', 'default', 'master', 'eureka.instance.preferIpAddress', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('spring-admin', 'default', 'master', 'eureka.instance.lease-renewal-interval-in-seconds', '10');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('spring-admin', 'default', 'master', 'eureka.instance.lease-expiration-duration-in-seconds', '30');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('spring-admin', 'default', 'master', 'eureka.client.registerWithEureka', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('spring-admin', 'default', 'master', 'eureka.client.fetchRegistry', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('spring-admin', 'default', 'master', 'eureka.client.serviceUrl.defaultZone', 'http://${EUREKA_SERVER1_HOST}:${EUREKA_SERVER1_PORT}/eureka/,http://${EUREKA_SERVER2_HOST}:${EUREKA_SERVER2_PORT}/eureka/');

-- biz-service
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('biz-service', 'default', 'master', 'server.port', '${SERVER_PORT:8003}');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('biz-service', 'default', 'master', 'eureka.instance.preferIpAddress', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('biz-service', 'default', 'master', 'eureka.instance.lease-renewal-interval-in-seconds', '10');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('biz-service', 'default', 'master', 'eureka.instance.lease-expiration-duration-in-seconds', '30');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('biz-service', 'default', 'master', 'eureka.client.registerWithEureka', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('biz-service', 'default', 'master', 'eureka.client.fetchRegistry', 'true');
INSERT INTO PROPERTIES (APPLICATION, PROFILE, LABEL, KEY, VALUE)
VALUES ('biz-service', 'default', 'master', 'eureka.client.serviceUrl.defaultZone', 'http://${EUREKA_SERVER1_HOST}:${EUREKA_SERVER1_PORT}/eureka/,http://${EUREKA_SERVER2_HOST}:${EUREKA_SERVER2_PORT}/eureka/');