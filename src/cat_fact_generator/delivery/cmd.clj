(ns cat-fact-generator.delivery.cmd
  (:require [cat-fact-generator.core.entity :as e]))

(defrecord CmdPresenter []
  e/FactPresenter
  (-present-fact [this fact]) (println fact))

(defn make-present []
  (->CmdPresenter))