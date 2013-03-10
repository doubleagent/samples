(defproject helloworld-ui "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [org.clojure/tools.namespace "0.2.1"]
                 [domina "1.0.1"]
                 [ch.qos.logback/logback-classic "1.0.6"]
                 [org.clojure/clojurescript "0.0-1450"]
                 [io.pedestal/pedestal.app "0.0.9-SNAPSHOT"]
                 [io.pedestal/pedestal.app-tools "0.0.9-SNAPSHOT"]]
  :profiles {:dev {:source-paths ["config" "app/src" "app/templates"]}}
  :aliases {"dumbrepl" ["trampoline" "run" "-m" "clojure.main/main"]})