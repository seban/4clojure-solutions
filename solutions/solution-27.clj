(defn solution-27
  ;; Solution for 4Clojure problem 27 - detect palingrome
  ;; http://www.4clojure.com/problem/27
  [coll] (= (seq coll) (reverse coll)))
