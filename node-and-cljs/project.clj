(defproject calvin-test "0.1.0-SNAPSHOT"
  :description "testing out calvin"
  :url "http://github.com/cstap/urikake"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :cljsbuild {:builds
              {:prod {:source-paths ["src"]
                      :compiler {:output-to "out/prod.js"
                                 :main test-ns.build
                                 :target :nodejs
                                 ;; :npm-deps causes to treat node
                                 ;; modules as proper name spaces
                                 :npm-deps {:shelljs "0.7.8"}
                                 :optimizations :advanced}}
               :dev {:source-paths ["src"]
                     :compiler {:output-to "out/main.js"
                                :main test-ns.main
                                :target :nodejs
                                ;; :npm-deps causes to treat node
                                ;; modules as proper name spaces
                                :npm-deps {:shelljs "0.7.8"}

                                :optimizations :none}}}              }
  :dependencies [[org.clojure/clojure "1.7.0-RC1"]
                 [medley "1.0.0"]]
  :source-paths ["src"])
