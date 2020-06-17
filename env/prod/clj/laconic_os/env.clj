(ns laconic-os.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[laconic-os started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[laconic-os has shut down successfully]=-"))
   :middleware identity})
