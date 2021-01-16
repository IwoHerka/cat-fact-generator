(ns cat-fact-generator.delivery.api
  (:require [cat-fact-generator.core.entity :as e]
            [clj-http.client :as http]))

(defrecord ApiProvider []
  e/FactProvider
  (-get-fact [this] ))
