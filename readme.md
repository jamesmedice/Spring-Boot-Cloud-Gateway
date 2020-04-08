 # Usage
1. Run mvn clean install

2. Run kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default

3. Build Docker images for each module, like: `docker build -t jamesmedice/enterprise`

4. In `/gcp-kubernetes` directory for each file : `kubectl apply -f <filename>.yaml` 

5. Run using skaffold docker run gcr.io/k8s-skaffold/skaffold:latest skaffold <<command>> 
 
6. DELETE ALL services  deployments configmaps ingress and secret
kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default


kubectl delete -n default deployment business

kubectl delete -n default deployment director

kubectl delete -n default deployment enterprise

kubectl delete -n default deployment seller

kubectl delete -n default deployment routergateway

kubectl delete -n default deployment mongodtstore

kubectl delete -n default service business

kubectl delete -n default service director

kubectl delete -n default service enterprise

kubectl delete -n default service seller

kubectl delete -n default service routergateway

kubectl delete -n default service mongodtstore

kubectl delete -n default configmap mongodtstore

kubectl delete -n default secret mongodtstore
