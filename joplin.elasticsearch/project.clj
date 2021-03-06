(defproject joplin.elasticsearch "0.3.8"
  :description "ElasticSearch support for Joplin"
  :url "http://github.com/juxt/joplin"
  :scm {:name "git"
        :url "https://github.com/juxt/joplin"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [joplin.core "0.3.8"]
                 [clojurewerkz/elastisch "2.2.1"]
                 [clj-time "0.12.0"]])
