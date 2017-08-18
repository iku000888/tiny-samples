(defproject calvin-test "0.1.0-SNAPSHOT"
  :description "testing out calvin"
  :url "http://github.com/cstap/urikake"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :cljsbuild {:builds
              {:dev {:source-paths ["src"]
                     :compiler {:output-to "out.js"
                                :main test-ns.main
                                :target :nodejs
                                :optimizations :none}}}}
  :dependencies [[medley "1.0.0"]]
  :source-paths ["src"])
