(defproject mqttitude-backend "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [hiccup "1.0.3"]
                 [clojurewerkz/machine_head "1.0.0-beta1"]
                 [ring/ring-jetty-adapter "1.1.6"]
                 [environ "0.2.1"]
                 [compojure "1.1.5"]]
  :plugins [[lein-ring "0.8.5"]]
  :main mqttitude-backend.server
  :ring {
;        :init
;        :destroy
         :handler mqttitude-backend.handler/app
         :port 8080}
  :repositories {"eclipse-paho" {:url "https://repo.eclipse.org/content/groups/paho/"
                                 :snapshots false
                                 :releases {:checksum :fail}}}
  :profiles
  {:production {:ring {:open-browser? false
                       :stacktraces? false
                       :auto-reload? false}}
   :dev {:dependencies [[ring-mock "0.1.5"]]}})
