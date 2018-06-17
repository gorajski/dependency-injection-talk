class H4DatabaseInterface
	def initialize(h4_database_config)		# Assume h4_database_config is a Hash
		@h4_database_config = h4_database_config
	end

	def sql_query(query)
		raw_result = Database.new(@h4_database_config).execute(query)
		if raw_result.valid? == true
			return raw_result.to_s
		else
			return "Error - There was a problem with the query"
		end
	end
end