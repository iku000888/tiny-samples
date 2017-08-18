(ns test-ns.build
  (:require [medley.core :as m]
            [shelljs :as s]))


(set! *warn-on-infer* true)
(enable-console-print!)

(js/console.log "running something from medley!")
(js/console.log (m/abs -98))

(js/console.log "running something from shelljs!")
(js/console.log
 (pr-str (s/cat "project.clj")))
