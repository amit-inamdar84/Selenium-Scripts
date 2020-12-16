exports.config = {
		seleniumAddress: 'http://localhost:4444/wd/hub',
		specs: ['HandlingDropdowns.js'],
		capabilities: {
			  'browserName': 'firefox'
			}
};