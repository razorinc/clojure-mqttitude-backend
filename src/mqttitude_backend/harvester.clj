(ns mqttitude-backend.harvester
  (:require [clojurewerkz.machine-head.client     :as mh]
            [clojurewerkz.machine-head.durability :as md])
  (:import java.util.concurrent.atomic.AtomicInteger
           org.eclipse.paho.client.mqttv3.persist.MemoryPersistence))


(def mqtt-agent
  "clojure.agent"
)

(defn harvest
  []
  (let [c  (mh/connect "tcp://192.168.1.247:1883" (mqtt-agent))
       ]
    (mh/subscribe c ["/mqttitude"] (fn [^String topic meta ^bytes payload]
                                    (println (String. payload "UTF-8"))
                                    (println "generated id: " (mqtt-agent))
                                    )
    (if-not (mh/connected? c)
      (println "You're not connected to the broker")
      )

    )))

(defn unharvest)
