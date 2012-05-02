(defproject ring-anti-forgery "0.1.2"
  :description "Ring middleware to prevent CSRF attacks"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/data.codec "0.1.0"]]
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.1"]]}})
