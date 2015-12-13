(defn solution-28
  ;; Write a function which flattens a sequence.
  [coll]
  (reduce (fn [val c]
            (if (coll? c)
              (into val (my-flatten c))
              (conj val c)))
          []
          coll))
