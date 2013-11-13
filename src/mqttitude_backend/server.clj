(ns mqttitude-backend.server
    (:require [ring.adapter.jetty :as jetty]
              [mqttitude-backend.handler :as handler]
              [environ.core :refer [env]]

    )
    (:gen-class)
    )


(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 8080))]
    (jetty/run-jetty #'handler/app {:port port :join? false})))