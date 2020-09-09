import os
#from PyPDF2 import PdfFileReader, PdfFileWriter
import re 
import xlsxwriter
import PyPDF2
from PyPDF2 import utils
from PyPDF2.pdf import PdfFileReader
import textract
entries = os.scandir('/Users/N7612/Desktop/TextExtract')
workbook = xlsxwriter.Workbook('/Users/N7612/Desktop/TextExtract/TextExtract1.xlsx')
worksheet = workbook.add_worksheet()
# pdfFileObj = open('/Users/N7612/Desktop/TextExtract/example.pdf', 'rb')
# pdfReader = PyPDF2.PdfFileReader(pdfFileObj)

for entry in entries:
    pdfFileObj = open(entry, 'rb')
    try:
        pdfReader = PyPDF2.PdfFileReader(pdfFileObj) 
        content = ""
        #Iterating pages and extract text
        for page in range(0,pdfReader.getNumPages()):
            pageObj = pdfReader.getPage(page)
            content+=pageObj.extractText()
        occurenceCount = 0
        column=0
        row=0
        findStr='Python'
        for m in re.finditer(findStr, content):
            occurenceCount+=1
             #print('ll found', m.start(), m.end())
        for i in range(0,occurenceCount):
            worksheet.write(i,column, findStr)
        print(content)
        workbook.close() 
        pdfFileObj.close
    except utils.PdfReadError:
        print("Error Occured")
 
# # printing number of pages in pdf file
# print(pdfReader.numPages)

# content = ""
# #Iterating pages and extract text

# for page in range(0,pdfReader.getNumPages()):
#     pageObj = pdfReader.getPage(page)
#     content+=pageObj.extractText()

# print(content)
 
# # closing the pdf file object
# pdfFileObj.close()

    # try:
    #     pdfReader = PyPDF2.PdfFileReader(pdfFileObj) 
    #     info = pdfReader.getDocumentInfo()
    # #     num_pages = pdfReader.numPages
    # #     count = 0
    # #     text = ""
    # #     #The while loop will read each page.
    # #     while count < num_pages:
    # #         pageObj = pdfReader.getPage(count)
    # #         count +=1
    # #         print(pageObj.extractText().encode('utf-8'))
    # #    # This if statement exists to check if the above library returned words. It's done because PyPDF2 cannot read scanned files.
    # #     # if text != "":
    # #     #     text = text
    # #     # print(text)
    # #     # print(pdfReader.numPages)
    # #     # pageObj = pdfReader.getPage(0)
    # #     # pdfData=pageObj.encode('utf-8')
    # #     # containedText =re.findall(r'\w+', 'IRCTC')
    # #     # print(containedText)
    # #     # column=0
    # #     # row=0
    # #     # for text in containedText:
    # #     #     print(row,column,text)
    # #     #     worksheet.write(row,column, text)
    # #     #     row+=1
    # #     # column+=1
    # #     # print(containedText)
    # #     # workbook.close() 
    # #     # pdfFileObj.close
    # except utils.PdfReadError:
    #     print("Error Occured")