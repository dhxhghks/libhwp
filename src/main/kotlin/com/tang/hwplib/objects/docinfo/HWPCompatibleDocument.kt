package com.tang.hwplib.objects.docinfo

import com.tang.hwplib.objects.docinfo.compatibledocument.HWPCompatibleDocumentSort
import com.tang.hwplib.objects.etc.COMPATIBLE_DOCUMENT
import com.tang.hwplib.util.extension.nullEquals

/**
 * 호환 문서를 나타내는 객체
 * Tag ID: HWPTAG_COMPATIBLE_DOCUMENT [COMPATIBLE_DOCUMENT]
 * 4 bytes
 *
 * @author accforaus
 *
 * @property [compatibleDocumentSort] [HWPCompatibleDocumentSort], 대상 프로그램 (UINT32 - unsigned 4 bytes)
 */
class HWPCompatibleDocument : HWPDocInfoElement() {
    var compatibleDocumentSort: HWPCompatibleDocumentSort? = null

    /**
     * 객체를 복사한 후 반환하는 함수
     *
     * @return [HWPCompatibleDocument] 복사된 객체 반환
     */
    override fun copy() : HWPCompatibleDocument = HWPCompatibleDocument().also {
        this.compatibleDocumentSort?.run { it.compatibleDocumentSort = HWPCompatibleDocumentSort.valueOf(this.value) }
    }

    companion object {
        /**
         * 객체를 생성하고 반환하는 함수
         *
         * @return [HWPCompatibleDocument] 생성된 객체 반환
         */
        fun build(compatibleDocumentSort: HWPCompatibleDocumentSort? = null)
                : HWPCompatibleDocument = HWPCompatibleDocument().apply {
            this.compatibleDocumentSort = compatibleDocumentSort
        }
    }

    override fun equals(other: Any?): Boolean = nullEquals(compatibleDocumentSort, (other as HWPCompatibleDocument).compatibleDocumentSort)
}