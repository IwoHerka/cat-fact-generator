(ns cat-fact-generator.delivery.api
  (:require [cat-fact-generator.core.entity :as e]
            [clojure.data.json :as json]
            [clj-http.client :as http]))

(def ^:private cat-url "https://catfact.ninja/fact")

(defn get-a-fact []
  (get (json/read-str (:body (http/get cat-url))) "fact"))

(defrecord ApiProvider []
  e/FactProvider
  (-get-fact [this] (get-a-fact)))

(defn make-provider []
  (->ApiProvider))