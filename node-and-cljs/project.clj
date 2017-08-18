(defproject calvin-test "0.1.0-SNAPSHOT"
  :description "testing out calvin"
  :url "http://github.com/cstap/urikake"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :cljsbuild {:builds
              {:dev {:source-paths ["src"]
                     :compiler {:output-to "out.js"
                                :main test-ns.main
                                :optimizations :none}}}}
  :dependencies [[com.cerner/clara-rules "0.15.2"]
                 [org.clojure/clojurescript "1.9.854"]]
  :source-paths ["src"])
