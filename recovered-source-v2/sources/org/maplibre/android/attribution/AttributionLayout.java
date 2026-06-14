package org.maplibre.android.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class AttributionLayout {
    private PointF anchorPoint;
    private Bitmap logo;
    private boolean shortText;

    public AttributionLayout(Bitmap bitmap, PointF pointF, boolean z) {
        this.logo = bitmap;
        this.anchorPoint = pointF;
        this.shortText = z;
    }

    public Bitmap getLogo() {
        return this.logo;
    }

    public PointF getAnchorPoint() {
        return this.anchorPoint;
    }

    public boolean isShortText() {
        return this.shortText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttributionLayout attributionLayout = (AttributionLayout) obj;
        Bitmap bitmap = this.logo;
        if (bitmap == null ? attributionLayout.logo != null : !bitmap.equals(attributionLayout.logo)) {
            return false;
        }
        PointF pointF = this.anchorPoint;
        return pointF != null ? pointF.equals(attributionLayout.anchorPoint) : attributionLayout.anchorPoint == null;
    }

    public int hashCode() {
        Bitmap bitmap = this.logo;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        PointF pointF = this.anchorPoint;
        return hashCode + (pointF != null ? pointF.hashCode() : 0);
    }

    public String toString() {
        return "AttributionLayout{logo=" + this.logo + ", anchorPoint=" + this.anchorPoint + AbstractJsonLexerKt.END_OBJ;
    }
}
