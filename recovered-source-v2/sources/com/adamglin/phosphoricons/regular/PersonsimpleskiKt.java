package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Personsimpleski.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleSki", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPersonSimpleSki", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleSki", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleskiKt {
    private static ImageVector _personSimpleSki;

    public static final ImageVector getPersonSimpleSki(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(172.0f, 88.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 172.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.32f, 77.76f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.92f, -5.44f);
        pathBuilder.lineTo(112.0f, 92.67f);
        pathBuilder.lineToRelative(10.32f, -10.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.lineTo(163.31f, 112.0f);
        pathBuilder.lineTo(200.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(160.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -2.34f);
        pathBuilder.lineTo(148.73f, 120.0f);
        pathBuilder.lineToRelative(-111.0f, -32.36f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 32.32f, 77.76f);
        pathBuilder.close();
        pathBuilder.moveTo(236.44f, 204.24f);
        pathBuilder.arcToRelative(69.78f, 69.78f, 0.0f, false, true, -58.37f, 8.95f);
        pathBuilder.lineTo(21.77f, 167.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.47f, -15.36f);
        pathBuilder.lineToRelative(76.0f, 22.13f);
        pathBuilder.lineTo(128.73f, 148.0f);
        pathBuilder.lineTo(85.8f, 135.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.4f, -15.39f);
        pathBuilder.lineToRelative(56.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.46f, 13.35f);
        pathBuilder.lineToRelative(-29.9f, 29.9f);
        pathBuilder.lineToRelative(62.79f, 18.28f);
        pathBuilder.arcToRelative(53.78f, 53.78f, 0.0f, false, false, 45.0f, -6.9f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.88f, 13.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleSki = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
