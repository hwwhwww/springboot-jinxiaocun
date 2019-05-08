package com.weichu.jinxiaocun.demo.comment;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


/**
 * 将试卷写入pdf的工具类
 *
 * @author QiaoLiQiang
 * @time 2018年1月6日上午11:32:25
 */
public class ExportPaperPdfUtil {
    private Font FontChinese;

    public ByteArrayOutputStream simplePDF(String title,String[] rowName,List<Object[]>  dataList) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            FontChinese = new Font(bfChinese, 12, Font.NORMAL);
            Document document = new Document();
            PdfWriter.getInstance(document, baos);
            document.open();
            PdfPTable table = null;
            table=new PdfPTable(rowName.length);
            table.addCell(getCell(title,6,1));
            for (int i=0;i<rowName.length;i++){
                table.addCell(getCell(rowName[i],1,1));
            }
            for (int j=0;j<dataList.size();j++){
                table.addCell(getCell(rowName[j],1,1));
            }
            table.setWidthPercentage(110); // 设置表格宽度
            document.add(table);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baos;
    }
    private PdfPCell getCell(String cellValue, int colspan, int rowSpan) {
        PdfPCell cell = new PdfPCell();
        try {
            cell = new PdfPCell(new Phrase(cellValue, FontChinese));
            cell.setRowspan(rowSpan);
            cell.setColspan(colspan);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cell;
    }
}