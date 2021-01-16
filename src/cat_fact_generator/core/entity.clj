(ns cat-fact-generator.core.entity)

(defprotocol FactProvider
  (-get-fact [this]))

(defprotocol FactPresenter
  (-present-fact [this fact]))

(defn get-fact [provider] (-get-fact provider))
(defn present-fact [presenter fact] (-present-fact presenter fact))