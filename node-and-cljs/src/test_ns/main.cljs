(ns test-ns.main)

(enable-console-print!)

(defn say-foo []
  (js/console.log "foo!!!"))

(comment

  ;;start socket repl server(another terminal)
  ;;calvin repl --socket-repl 3333

  ;;connect to it with (emacs)
  ;;M-x inf-clojure-connect

  ;;Enable evaling forms in this file
  ;;M-x inf-clojure-minor-mode

  ;;Can use stuff from clojars!!
  (require '[medley.core :as m])
  (m/abs -98)


  ;;Can use stuff from npm!! (old way)
  (require '[cljs.nodejs :as node])
  (def s (node/require "shelljs"))
  (.cat s "project.clj")

  ;;This one now works!!!
  (require 'shelljs) ;;proper cljs name space
  (shelljs/cat "project.clj")

  ;;Try building a minified app
  (require '[lumo.build.api :as b])
  (b/build "src"
           {:main 'test-ns.build
            :output-to "out/built.js"
            ;;shell js not working yet with :advanced...
            :optimizations :simple
            :verbose true
            :target :nodejs})

  )
