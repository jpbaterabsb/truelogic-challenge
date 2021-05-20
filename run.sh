echo "Build Producer" && \
cd producer && mvn clean package && cd .. && \
echo "Build Consumer" && \
cd consumer && mvn clean package && cd .. && \
echo "Build Images" && \
docker-compose build && \
echo "Run applications" && \
docker-compose up
