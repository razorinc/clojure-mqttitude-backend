(ns mqttitude-backend.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [mqttitude-backend.pages :as pages]
            [compojure.route :as route]))


(defroutes app-routes
  (GET "/" [] (pages/index))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
