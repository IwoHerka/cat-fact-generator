(ns cat-fact-generator.core
  (:require [cat-fact-generator.state :as s])
  (:gen-class))

(defn -main
  [& args]
  (s/start-program)
  (s/get-fact))