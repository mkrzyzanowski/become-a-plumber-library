def call(Map cfg) {
    def version = readFile cfg.file ?: 'VERSION'
    def (major, minor, bugfix) = version.tokenize('.')
    env.newVersion = "$major.$minor.${++(bugfix as Integer)}"
}