(ns laconic-os.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [laconic-os.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[laconic-os started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[laconic-os has shut down successfully]=-"))
   :middleware wrap-dev})
