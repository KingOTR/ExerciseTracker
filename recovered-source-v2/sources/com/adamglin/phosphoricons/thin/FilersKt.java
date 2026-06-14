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

/* compiled from: Filers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileRs", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFileRs", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileRs", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilersKt {
    private static ImageVector _fileRs;

    public static final ImageVector getFileRs(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _fileRs;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileRs", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(210.83f, 85.17f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 28.0f);
        pathBuilder.lineTo(56.0f, 28.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(52.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.lineTo(148.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(52.0f);
        pathBuilder.lineTo(204.0f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(184.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(212.0f, 88.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 210.83f, 85.17f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 41.65f);
        pathBuilder.lineTo(198.34f, 84.0f);
        pathBuilder.lineTo(156.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 172.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f);
        pathBuilder.lineTo(48.0f, 148.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(52.0f, 196.0f);
        pathBuilder.lineTo(64.0f, 196.0f);
        pathBuilder.arcToRelative(23.85f, 23.85f, 0.0f, false, false, 7.64f, -1.25f);
        pathBuilder.lineTo(80.54f, 210.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.92f, -4.0f);
        pathBuilder.lineToRelative(-8.77f, -15.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 88.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 188.0f);
        pathBuilder.lineTo(52.0f, 188.0f);
        pathBuilder.lineTo(52.0f, 156.0f);
        pathBuilder.lineTo(64.0f, 156.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(151.84f, 195.8f);
        pathBuilder.arcToRelative(17.0f, 17.0f, 0.0f, false, true, -7.43f, 12.41f);
        pathBuilder.curveToRelative(-4.39f, 2.91f, -10.0f, 3.77f, -15.22f, 3.77f);
        pathBuilder.arcTo(57.89f, 57.89f, 0.0f, false, true, 115.0f, 210.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.15f, -7.7f);
        pathBuilder.curveToRelative(4.22f, 1.17f, 16.56f, 3.29f, 22.83f, -0.88f);
        pathBuilder.arcToRelative(8.94f, 8.94f, 0.0f, false, false, 3.91f, -6.75f);
        pathBuilder.curveToRelative(0.83f, -6.45f, -4.38f, -8.69f, -15.64f, -11.94f);
        pathBuilder.curveToRelative(-9.68f, -2.8f, -21.72f, -6.28f, -20.14f, -18.77f);
        pathBuilder.arcToRelative(16.66f, 16.66f, 0.0f, false, true, 7.22f, -12.13f);
        pathBuilder.curveToRelative(4.56f, -3.07f, 11.0f, -4.36f, 19.1f, -3.82f);
        pathBuilder.arcToRelative(61.33f, 61.33f, 0.0f, false, true, 10.48f, 1.61f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.05f, 7.74f);
        pathBuilder.curveToRelative(-4.29f, -1.13f, -16.81f, -3.12f, -23.06f, 1.11f);
        pathBuilder.arcToRelative(8.51f, 8.51f, 0.0f, false, false, -3.75f, 6.49f);
        pathBuilder.curveToRelative(-0.66f, 5.17f, 3.89f, 7.0f, 14.42f, 10.08f);
        pathBuilder.curveTo(140.26f, 178.0f, 153.64f, 181.84f, 151.84f, 195.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileRs = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
