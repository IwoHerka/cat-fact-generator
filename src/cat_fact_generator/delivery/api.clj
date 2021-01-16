(ns cat-fact-generator.delivery.api
  (:require [cat-fact-generator.core.entity :as e]
            [clojure.data.json :as json]
            [clj-http.client :as http]))

(defrecord ApiProvider []
  e/FactProvider
  (-get-fact [this] ))

(json/read-str (:body (http/get "https://catfact.ninja/fact")))

(get (http/get "https://catfact.ninja/fact") :body)