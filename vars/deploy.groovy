def call(Map config) {
    def name = config.name
    def port = config.port
    sh "docker rm -f ${name} || exit 0"
    sh "docker run -d -p $port:9999 --name '${name}' plumbers/sparktodo:SNAPSHOT"
}