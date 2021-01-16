(ns cat-fact-generator.core.use-case
  (:require [cat-fact-generator.core.entity :as e]))

(defn generate-cat-fact [provider presenter]
  (let [fact (e/get-fact provider)]
    (e/present-fact presenter fact)))