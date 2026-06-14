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

/* compiled from: Person.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Person", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPerson", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_person", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonKt {
    private static ImageVector _person;

    public static final ImageVector getPerson(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _person;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Person", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.29f, 131.34f);
        pathBuilder.lineTo(176.17f, 80.19f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 150.55f, 68.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -45.1f, 0.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 79.83f, 80.19f);
        pathBuilder.lineTo(34.71f, 131.34f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.7f, 34.16f);
        pathBuilder.lineToRelative(6.73f, -5.39f);
        pathBuilder.lineTo(61.74f, 211.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 43.74f, 19.69f);
        pathBuilder.lineTo(128.0f, 191.9f);
        pathBuilder.lineToRelative(22.52f, 38.79f);
        pathBuilder.arcToRelative(23.82f, 23.82f, 0.0f, false, false, 13.27f, 11.85f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 194.26f, 211.0f);
        pathBuilder.lineToRelative(-13.4f, -50.89f);
        pathBuilder.lineToRelative(6.73f, 5.39f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.7f, -34.16f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(203.0f, 147.12f);
        pathBuilder.lineTo(167.48f, 118.63f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.11f, 12.42f);
        pathBuilder.lineTo(171.27f, 218.0f);
        pathBuilder.arcToRelative(12.18f, 12.18f, 0.0f, false, false, 0.73f, 2.0f);
        pathBuilder.arcToRelative(10.72f, 10.72f, 0.0f, false, false, -0.5f, -1.0f);
        pathBuilder.lineTo(138.38f, 162.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.76f, 0.0f);
        pathBuilder.lineTo(84.5f, 219.0f);
        pathBuilder.arcToRelative(10.72f, 10.72f, 0.0f, false, false, -0.5f, 1.0f);
        pathBuilder.arcToRelative(13.16f, 13.16f, 0.0f, false, false, 0.73f, -2.0f);
        pathBuilder.lineToRelative(22.87f, -86.92f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.11f, -12.42f);
        pathBuilder.lineTo(53.0f, 147.12f);
        pathBuilder.arcToRelative(11.5f, 11.5f, 0.0f, false, false, -1.0f, 0.87f);
        pathBuilder.curveToRelative(0.18f, -0.17f, 0.35f, -0.36f, 0.52f, -0.54f);
        pathBuilder.lineTo(97.83f, 96.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.0f, -4.06f);
        pathBuilder.horizontalLineToRelative(42.34f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.0f, 4.06f);
        pathBuilder.lineToRelative(45.32f, 51.39f);
        pathBuilder.curveToRelative(0.17f, 0.18f, 0.34f, 0.37f, 0.52f, 0.54f);
        pathBuilder.arcTo(11.5f, 11.5f, 0.0f, false, false, 203.0f, 147.12f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _person = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
