(ns cat-fact-generator.state
  (:require [cat-fact-generator.delivery.api :as api]
            [cat-fact-generator.delivery.cmd :as cmd]
            [cat-fact-generator.core.use-case :as uc]
            [mount.core :refer [defstate]]))

(defstate provider :start (api/make-provider))
(defstate presenter :start (cmd/make-presenter))
(defstate get-fact :start (partial uc/generate-cat-fact provider presenter))

(defn start-program [] (mount.core/start))