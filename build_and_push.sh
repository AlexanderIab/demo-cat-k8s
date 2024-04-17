./gradlew clean build

docker build . -t alexanderi/demo-cat-k8s:1.0.0
docker push alexanderi/demo-cat-k8s:1.0.0
