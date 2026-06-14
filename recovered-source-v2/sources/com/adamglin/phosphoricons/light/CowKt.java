package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCow", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CowKt {
    private static ImageVector _cow;

    public static final ImageVector getCow(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cow", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(102.0f, 192.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(80.0f, 198.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(96.0f, 186.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 186.0f);
        pathBuilder.lineTo(160.0f, 186.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 114.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 100.0f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 114.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 156.0f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(242.85f, 120.85f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 232.0f, 126.0f);
        pathBuilder.lineTo(198.0f, 126.0f);
        pathBuilder.verticalLineToRelative(35.05f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, true, 176.0f, 230.0f);
        pathBuilder.lineTo(80.0f, 230.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, -22.0f, -68.95f);
        pathBuilder.lineTo(58.0f, 126.0f);
        pathBuilder.lineTo(24.0f, 126.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -10.87f, -5.15f);
        pathBuilder.arcToRelative(13.82f, 13.82f, 0.0f, false, true, -2.88f, -11.5f);
        pathBuilder.arcTo(54.12f, 54.12f, 0.0f, false, true, 63.22f, 66.0f);
        pathBuilder.horizontalLineToRelative(6.89f);
        pathBuilder.arcTo(53.93f, 53.93f, 0.0f, false, true, 50.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, 42.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, -42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.arcToRelative(53.93f, 53.93f, 0.0f, false, true, -20.11f, 42.0f);
        pathBuilder.horizontalLineToRelative(6.89f);
        pathBuilder.arcToRelative(54.12f, 54.12f, 0.0f, false, true, 52.95f, 43.35f);
        pathBuilder.arcTo(13.82f, 13.82f, 0.0f, false, true, 242.85f, 120.85f);
        pathBuilder.close();
        pathBuilder.moveTo(58.0f, 114.0f);
        pathBuilder.lineTo(58.0f, 104.0f);
        pathBuilder.arcTo(37.87f, 37.87f, 0.0f, false, true, 68.32f, 78.0f);
        pathBuilder.horizontalLineToRelative(-5.1f);
        pathBuilder.arcTo(42.08f, 42.08f, 0.0f, false, false, 22.0f, 111.7f);
        pathBuilder.arcToRelative(1.83f, 1.83f, 0.0f, false, false, 0.4f, 1.55f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 192.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, -26.0f);
        pathBuilder.lineTo(80.0f, 166.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 202.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 155.34f);
        pathBuilder.lineTo(186.0f, 104.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, -26.0f);
        pathBuilder.lineTo(96.0f, 78.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, 26.0f);
        pathBuilder.verticalLineToRelative(51.34f);
        pathBuilder.arcTo(37.94f, 37.94f, 0.0f, false, true, 80.0f, 154.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(37.94f, 37.94f, 0.0f, false, true, 186.0f, 155.34f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 111.7f);
        pathBuilder.arcTo(42.08f, 42.08f, 0.0f, false, false, 192.78f, 78.0f);
        pathBuilder.horizontalLineToRelative(-5.1f);
        pathBuilder.arcTo(37.87f, 37.87f, 0.0f, false, true, 198.0f, 104.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineToRelative(34.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.58f, -0.75f);
        pathBuilder.arcTo(1.83f, 1.83f, 0.0f, false, false, 234.0f, 111.7f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
