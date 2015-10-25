(defn solution-22
  ;; Resolve of 4Clojure 22nd problem - count sequence elements.
  ;; http://www.4clojure.com/problem/22
  [coll] (reduce (fn [n _] (inc n)) 0 coll))
