(ns test-ns.main)

(enable-console-print!)

(defn say-foo []
  (js/console.log "foo!!!"))

(comment

  ;;Can use stuff from clojars!!
  (require '[medley.core :as m])
  (m/abs -98)


  ;;Can use stuff from npm!!
  (require '[cljs.nodejs :as node])
  (def s (node/require "shelljs"))
  (.cat s "project.clj")


  )
