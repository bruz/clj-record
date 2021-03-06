(ns clj-record.test-model.config)

(comment
(def db {:classname "org.apache.derby.jdbc.EmbeddedDriver"
	 :subprotocol "derby"
	 :subname "/tmp/clj-record.test.db"
	 :create true}))

(comment
  (def db {:classname "org.postgresql.Driver" 
           :subprotocol "postgresql" 
           :subname "//localhost:5432/test"
           :user "user"
           :password "pass"}))

(comment)
  (def db {:classname "com.mysql.jdbc.Driver" 
	   :subprotocol "mysql" 
	   :user "root" 
	   :password "" 
	   :subname "//localhost/clj_record_test"})

(comment
  (def db {:classname "com.microsoft.sqlserver.jdbc.SQLServerDriver"
	 :subprotocol "sqlserver"
	 :subname "//localhost;instanceName=TEST;databaseName=test;user=username;password=password;"
	 :create true}))

(comment
  (def db {:classname "com.ibm.db2.jcc.DB2Driver"
	   :subprotocol "db2"
	   :user "db2"
	   :password "db2"
	   :subname "//localhost:50000/clojure:currentSchema=CLJRECORD;"}))

