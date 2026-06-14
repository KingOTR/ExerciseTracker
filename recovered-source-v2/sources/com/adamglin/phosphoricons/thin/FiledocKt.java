package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Filedoc.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileDoc", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFileDoc", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileDoc", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiledocKt {
    private static ImageVector _fileDoc;

    public static final ImageVector getFileDoc(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _fileDoc;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileDoc", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.0f, 148.0f);
        pathBuilder.lineTo(36.0f, 148.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(52.0f, 212.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 204.0f);
        pathBuilder.lineTo(40.0f, 204.0f);
        pathBuilder.lineTo(40.0f, 156.0f);
        pathBuilder.lineTo(52.0f, 156.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.77f, 198.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.12f, 5.66f);
        pathBuilder.arcTo(26.11f, 26.11f, 0.0f, false, true, 200.0f, 212.0f);
        pathBuilder.curveToRelative(-15.44f, 0.0f, -28.0f, -14.36f, -28.0f, -32.0f);
        pathBuilder.reflectiveCurveToRelative(12.56f, -32.0f, 28.0f, -32.0f);
        pathBuilder.arcToRelative(26.11f, 26.11f, 0.0f, false, true, 18.89f, 8.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.78f, 5.54f);
        pathBuilder.arcTo(18.15f, 18.15f, 0.0f, false, false, 200.0f, 156.0f);
        pathBuilder.curveToRelative(-11.0f, 0.0f, -20.0f, 10.77f, -20.0f, 24.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, 24.0f, 20.0f, 24.0f);
        pathBuilder.arcToRelative(18.15f, 18.15f, 0.0f, false, false, 13.11f, -5.9f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 218.77f, 198.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 148.0f);
        pathBuilder.curveToRelative(-15.44f, 0.0f, -28.0f, 14.36f, -28.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(12.56f, 32.0f, 28.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(28.0f, -14.36f, 28.0f, -32.0f);
        pathBuilder.reflectiveCurveTo(143.44f, 148.0f, 128.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 204.0f);
        pathBuilder.curveToRelative(-11.0f, 0.0f, -20.0f, -10.77f, -20.0f, -24.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, -24.0f, 20.0f, -24.0f);
        pathBuilder.reflectiveCurveToRelative(20.0f, 10.77f, 20.0f, 24.0f);
        pathBuilder.reflectiveCurveTo(139.0f, 204.0f, 128.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(52.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.lineTo(148.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(52.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(212.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 28.0f);
        pathBuilder.lineTo(56.0f, 28.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 48.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 41.65f);
        pathBuilder.lineTo(198.34f, 84.0f);
        pathBuilder.lineTo(156.0f, 84.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileDoc = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
