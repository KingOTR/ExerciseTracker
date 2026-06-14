package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimpleski.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleSki", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPersonSimpleSki", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleSki", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleskiKt {
    private static ImageVector _personSimpleSki;

    public static final ImageVector getPersonSimpleSki(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _personSimpleSki;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleSki", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 92.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 176.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 52.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.48f, 80.64f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.88f, -8.16f);
        pathBuilder.lineToRelative(67.5f, 19.68f);
        pathBuilder.lineToRelative(8.66f, -8.65f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f);
        pathBuilder.lineTo(165.0f, 112.0f);
        pathBuilder.horizontalLineToRelative(35.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(160.0f, 136.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.48f, -3.51f);
        pathBuilder.lineToRelative(-4.89f, -4.89f);
        pathBuilder.lineToRelative(-110.0f, -32.07f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 28.48f, 80.64f);
        pathBuilder.close();
        pathBuilder.moveTo(238.65f, 211.57f);
        pathBuilder.arcTo(73.77f, 73.77f, 0.0f, false, true, 177.0f, 221.0f);
        pathBuilder.lineTo(20.65f, 175.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 6.71f, -23.0f);
        pathBuilder.lineToRelative(79.92f, 23.27f);
        pathBuilder.lineToRelative(13.81f, -13.81f);
        pathBuilder.lineTo(84.7f, 151.53f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 6.6f, -23.07f);
        pathBuilder.lineToRelative(56.0f, 16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.19f, 20.0f);
        pathBuilder.lineTo(133.56f, 183.4f);
        pathBuilder.lineTo(183.66f, 198.0f);
        pathBuilder.arcToRelative(49.81f, 49.81f, 0.0f, false, false, 41.68f, -6.39f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.31f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleSki = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
