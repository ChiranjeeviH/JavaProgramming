import os
import re 
import xlsxwriter
import PyPDF2
from PyPDF2 import utils
from PyPDF2.pdf import PdfFileReader
import textract
entries = os.scandir('/Users/N7612/Desktop/TextExtract')
workbook = xlsxwriter.Workbook('/Users/N7612/Desktop/TextExtract/TextExtract2.xlsx')
worksheet = workbook.add_worksheet()

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
        for i in range(0,occurenceCount):
            worksheet.write(i,column, findStr)
        print(content)
        workbook.close() 
        pdfFileObj.close
    except utils.PdfReadError:
        print("Error Occured")