[1mdiff --git a/.github/workflows/_GCP-Deploy.yml b/.github/workflows/_GCP-Deploy.yml[m
[1mindex 1c3d3d9..73c7e2c 100644[m
[1m--- a/.github/workflows/_GCP-Deploy.yml[m
[1m+++ b/.github/workflows/_GCP-Deploy.yml[m
[36m@@ -32,10 +32,4 @@[m [mjobs:[m
         run: docker build -t $IMAGE_NAME .[m
 [m
       - name: Push Docker image[m
[31m-        run: docker push $IMAGE_NAME[m
[31m-[m
[31m-      - name: Deploy GCP[m
[31m-        run: kubectl apply -f deploy-app.yml[m
[31m-[m
[31m-      - name: Loadbalancer[m
[31m-        run: kubectl apply -f service-node.yml[m
\ No newline at end of file[m
[32m+[m[32m        run: docker push $IMAGE_NAME[m
\ No newline at end of file[m
[1mdiff --git a/Dockerfile b/Dockerfile[m
[1mindex 6357835..fb4d45d 100644[m
[1m--- a/Dockerfile[m
[1m+++ b/Dockerfile[m
[36m@@ -6,7 +6,7 @@[m [mRUN gradle build --no-daemon[m
 [m
 FROM openjdk:11-jre-slim[m
 [m
[31m-EXPOSE 8080[m
[32m+[m[32mEXPOSE 8080:80[m
 [m
 RUN mkdir /app[m
 [m
