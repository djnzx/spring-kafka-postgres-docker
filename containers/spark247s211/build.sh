SPARK_VERSION="2.4.7"
HADOOP_VERSION="2.7"
JUPYTERLAB_VERSION="3.0.12"

docker build \
  -f cluster-base.Dockerfile \
  -t cluster-base .

docker build \
  --build-arg spark_version="${SPARK_VERSION}" \
  -f spark-base.Dockerfile \
  -t spark-base .

docker build \
  -f spark-master.Dockerfile \
  -t spark-master .

docker build \
  -f spark-worker.Dockerfile \
  -t spark-worker .

docker build \
  --build-arg spark_version="${SPARK_VERSION}" \
  --build-arg jupyterlab_version="${JUPYTERLAB_VERSION}" \
  -f jupyterlab.Dockerfile \
  -t jupyterlab .
