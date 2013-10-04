(ns mqttitude-backend.pages
  (:use [hiccup.page :only (html5)]
        [compojure.core :only (defroutes GET POST)])
  (:require [clojure.string :as str]
            [ring.util.response :as ring]
            )
  )

(defn index []
  (html5
    [:head
      [:title "Hello World"]]
    [:body
      [:div {:id "content"} "Hello Borld"]])
  )
