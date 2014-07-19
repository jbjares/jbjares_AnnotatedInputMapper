#覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧-
# Name: countdown.py
# Role: Simple demonstration of a Jython Module
#覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧-
'A holding place for some potentially useful functions'

#覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧-
# Name: countdown()
# Role: Simple function
#覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧-
def countdown( start=10 ):
	'Simple function used to display countdown data'

 	while start > 0 :
 		print start,
 		start -= 1
 	print 'done'

#覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧-
# Statements executed when the file is loaded
#覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧-
if __name__ == 'main' or __name__ == '__main__' :
 print 'countdown.py executed as a stand-alone script file'
else :
 print 'countdown.py loaded as a module'

print 'dir():', dir()