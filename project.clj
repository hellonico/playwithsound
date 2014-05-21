(defproject playwithsound "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :repl-options {
               :prompt (fn [ns] (str "Ready to play music <" ns "> " ))
               :init-ns playwithsound.core}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]])
